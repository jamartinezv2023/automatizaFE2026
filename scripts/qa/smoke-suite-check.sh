#!/usr/bin/env bash
set -euo pipefail

echo "== Guardia Smoke E2E =="
echo "== Conteo de escenarios @smoke =="
grep -R "@smoke" src/test/resources/features | wc -l

echo "== Validando suite @smoke =="
./gradlew clean test aggregate -Dcucumber.filter.tags="@smoke" "$@"

echo "== Suite @smoke validada correctamente =="
