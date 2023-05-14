package co.com.sebuscan.missing.people.service

interface LookAndSaveService<T> {
    fun lookById(id: Int): T
    fun lookAllById(id: Int): List<T>
    fun save(model:T): Boolean
}