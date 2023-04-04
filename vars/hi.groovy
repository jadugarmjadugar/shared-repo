def call() {
     sh 'sh pwd'
     sh 'echo "hello from fun"'
     sh "sh ./hello-world.sh"
}
