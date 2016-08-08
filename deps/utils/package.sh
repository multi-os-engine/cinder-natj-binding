#!/bin/bash

set -e

cd "${0%/*}"

export SAMPLE_EXEC_PATH=$1
export SAMPLE_TARGET_DIR=$2
export SAMPLE_TARGET_NAME=$3
export RESOURCE_PATH=$4

rm -rf "$SAMPLE_TARGET_DIR"
mkdir -p "$SAMPLE_TARGET_DIR/$SAMPLE_TARGET_NAME.app/Contents/MacOS"
mkdir -p "$SAMPLE_TARGET_DIR/$SAMPLE_TARGET_NAME.app/Contents/Resources"

cp Info.plist "$SAMPLE_TARGET_DIR/$SAMPLE_TARGET_NAME.app/Contents/"
echo "APPL????" > "$SAMPLE_TARGET_DIR/$SAMPLE_TARGET_NAME.app/Contents/PkgInfo"
cp CinderApp.icns "$SAMPLE_TARGET_DIR/$SAMPLE_TARGET_NAME.app/Contents/Resources/"
cp "$SAMPLE_EXEC_PATH" "$SAMPLE_TARGET_DIR/$SAMPLE_TARGET_NAME.app/Contents/MacOS/"

if [ -d "$RESOURCE_PATH" ]; then
    cp "$RESOURCE_PATH"/* "$SAMPLE_TARGET_DIR/$SAMPLE_TARGET_NAME.app/Contents/Resources/"
fi
