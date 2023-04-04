def call() {
     sh 'echo "hello from fun"'
     runLinuxScript(name: "hello-world.sh")
}
