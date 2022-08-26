# todo: flatten dir
sbt fullOptJS
mkdir -p dist
cp target/scala-2.12/classes/index.html ./dist/
cp target/scala-2.12/uuidgen-opt.js ./dist/
