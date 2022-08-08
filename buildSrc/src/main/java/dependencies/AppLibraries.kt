package dependencies

import dependencies.android.*
import dependencies.kotlin.*
import dependencies.okhttp.*
import org.gradle.api.artifacts.dsl.DependencyHandler

fun DependencyHandler.appLibraries() {
    androidCore()
    androidPaging()
    androidX()
    viewModelLifeCycle()
    coroutine()
    gson()
    okHttp()
    retrofit()
    daggerHilt()
    gander()
    glide()
    materialDesign()
    navGraph()
    testUnit()
    youtubePlayer()
}