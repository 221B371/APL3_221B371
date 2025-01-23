class Two extends One {
    // Compiler will throw an error here
    Two() {
        // Implicit call to super() which is One()
    }
}
