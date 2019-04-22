package com.sevtech.hellographql.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("project")
data class Project(@Id var id: String?,
                   var name: String,
                   @Transient var developers: List<Developer> = listOf()) {

    constructor(id: String, name: String) : this(id, name, listOf())

}