package co.com.sebuscan.missing.people.mapper

interface CommonMapper<I,O> {

    fun input(input: I):O
    fun output(output: O):I
}