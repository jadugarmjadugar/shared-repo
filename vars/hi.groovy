def call() {
     sh 'echo "hello"'
     sh "./shared-repo/vars/hello-world.sh"
}
