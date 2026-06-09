#!/usr/bin/env bash
set -euo pipefail

echo "== Entorno =="
uname -a || true
java -version || true
./gradlew --version || true

echo "== Chrome =="
google-chrome --version || true
chrome --version || true
chromium --version || true

echo "== Conteo de escenarios @stable =="
grep -R "@stable" src/test/resources/features | wc -l

echo "== Validando suite @stable =="
./gradlew clean test aggregate -Dcucumber.filter.tags="@stable" "$@"

echo "== Suite @stable validada correctamente =="
