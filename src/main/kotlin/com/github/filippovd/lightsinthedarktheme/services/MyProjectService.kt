package com.github.filippovd.lightsinthedarktheme.services

import com.intellij.openapi.project.Project
import com.github.filippovd.lightsinthedarktheme.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
