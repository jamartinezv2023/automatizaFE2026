#!/usr/bin/env bash
set -euo pipefail

echo "== Inventario Domain E2E =="
echo "== Conteo de escenarios @domain =="
grep -R "@domain" src/test/resources/features | wc -l

echo "== Escenarios por archivo =="
grep -R "@domain" src/test/resources/features

echo "== Validacion de compilacion =="
./gradlew clean testClasses

echo "== Inventario domain validado a nivel de compilacion =="
