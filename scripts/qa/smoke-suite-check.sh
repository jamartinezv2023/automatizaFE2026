#!/usr/bin/env bash
set -euo pipefail

echo "== Guardia Smoke E2E =="
echo "== Conteo de escenarios @smoke =="
grep -R "@smoke" src/test/resources/features | wc -l

echo "== Compilando suite E2E smoke =="
./gradlew clean testClasses

echo "== Smoke E2E validado a nivel de compilacion =="
