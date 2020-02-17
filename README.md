# aem-training-htl-exercise
HTL Exercise for C&amp;T AEM Training

1. Clone the repository.
2. Make sure author is up.
3. Open the repository in IntelliJ: `File -> New -> Project From Existing Sources`.
4. In the IntelliJ Terminal, input `cd sling-models`
5. Run `mvn clean install -P adobe-public -P autoInstallPackage -P autoInstallBundle` in the terminal.
6. Wait.
7. After installing, check in CRXDE that you have the following files:
- /apps/sling-model-exercise/components/content/testhtl
- /apps/sling-model-exercise/components/content/testjsp
8. Go to `http://localhost:4502/sites.html/content/sling-model-exercise/en`.
9. Create a new page under `English`.
