#!/usr/bin/env bash
set -euo pipefail

echo "== Guardia de compilación E2E =="
echo "== Conteo de escenarios @stable =="
grep -R "@stable" src/test/resources/features | wc -l

echo "== Compilando pruebas =="
./gradlew clean testClasses

echo "== Compilación E2E validada correctamente =="
