#!/usr/bin/env bash
set -euo pipefail

echo "== Remote Regression E2E =="
echo "== Conteo @remote @regression =="
grep -R "@remote" src/test/resources/features | grep "@regression" | wc -l

echo "== Ejecutando suite remota de regresion =="
./gradlew clean test aggregate -Dcucumber.filter.tags="@remote and @regression" "$@"

echo "== Remote regression finalizada =="
