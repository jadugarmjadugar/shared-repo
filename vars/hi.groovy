def call() {
     sh 'echo "hello from fun"'
     script(name: "hello-world.sh")
}
