plugins {
    id("fr.stardustenterprises.rust.wrapper") version "3.0.0"
}

rust {
    command.set("cargo")

    targets += defaultTarget()
}