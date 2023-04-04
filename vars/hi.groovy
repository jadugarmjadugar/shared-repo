def call() {
    'echo "hello"'
    loadLinuxScript(name: 'hello-world.sh')
     sh "./hello-world.sh"
}
