dependencyResolutionManagement {
    repositories {
        google(); mavenCentral()
        maven { url = uri("https://ourostack.github.io/ouro-ui-android/maven") }
    }
}
rootProject.name = "ouro-current-fixture-android"
include(":app")
