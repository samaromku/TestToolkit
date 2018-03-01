package ru.andrey.savchenko.testtoolkit.toolkit

import java.lang.ref.WeakReference

/**
 * Created by Kartashov A.A. on 7/12/17.
 * This class used for providing class instances
 * Some kind of DI for classes without constructor params
 * Holding classes in a weak reference to avoid leaks and optimal memory usage
 */

object Component {
    private val instances = HashMap<String, WeakReference<Any>>()

    /**
     * Return class instance if it already exists, crete new one otherwise
     * @param componentClass class of the requested object
     * @return componentClass instance
     */
    fun <T> getComponent(componentClass: Class<T>): T {
        var presenter: T? = instances[componentClass.name]?.get() as T?
        if (presenter == null) {
            presenter = componentClass.newInstance()
        }
        instances.put(componentClass.name, WeakReference(presenter as Any))
        return presenter
    }
}