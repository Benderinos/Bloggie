/*
 * Copyright 2019 littledavity
 */
include(
    BuildModules.APP,
    BuildModules.CORE,
    BuildModules.Features.SPLASH,
    BuildModules.Features.LOGIN,
    BuildModules.Features.HOME,
    BuildModules.Features.FEED,
    BuildModules.Libraries.TEST_UTILS,
    BuildModules.Commons.UI
)

rootProject.buildFileName = "build.gradle.kts"
