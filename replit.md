# Imported Java/Maven project

## Run on Replit

This project is a Java console application. Its entry point is
`src/main/java/Main.java`, which prints a greeting and then exits.

- Run the configured `Start application` workflow to execute it.
- Click **Run** and view the greeting in the **Console**. The workflow finishes
  normally after printing `Hello world JPWP2!`; this is not a web server.
- Build and test manually with `mvn test`.
- Run the entry point directly with `javac -d . src/main/java/Main.java && java -cp . Main`.

The Java toolchain is provided by the Replit project configuration.
No secrets or external services are required. Maven resolves the dependencies
declared in `pom.xml`; there are currently no active automated tests.
