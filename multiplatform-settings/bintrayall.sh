set -e
./gradlew bintrayUpload -PbintrayAndroid=true
./gradlew bintrayUpload -PbintrayCommon=true
./gradlew bintrayUpload -PbintrayIos=true