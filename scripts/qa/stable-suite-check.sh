#!/usr/bin/env bash
set -euo pipefail

echo "== Guardia E2E remota @stable =="
echo "== Esta guardia depende de disponibilidad del frontend remoto =="
echo "== Conteo de escenarios @stable =="
grep -R "@stable" src/test/resources/features | wc -l

echo "== Validando suite @stable =="
./gradlew clean test aggregate -Dcucumber.filter.tags="@stable" "$@"

echo "== Suite @stable validada correctamente =="
