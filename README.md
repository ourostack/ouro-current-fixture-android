# Ouro Current fixture: Android

A test repository for [Ouro Current](https://ui.ouroboros.bot/current/). It pins [Ouro UI for Android](https://github.com/ourostack/ouro-ui-android) through Gradle at an old release, so each new release shows up here as one Ouro Current pull request. Nothing here is built or shipped.

- `gradle/libs.versions.toml`: a version catalog whose `ouro` version both libraries refer to.
- `app/build.gradle.kts`: `bot.ouro.ui:ouro-actions`, written as a plain coordinate.
