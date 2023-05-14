package co.com.sebuscan.missing.people.service

interface FindRandomService <T>{
    fun getRandomEntries(count: Int): List<T>
}