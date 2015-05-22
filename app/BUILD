java_binary(
  name = "app",
  main_class = "app.App",
  runtime_deps = [
    "//app/src/main/java/app",
  ],
)

java_test(
  name = "test",
  srcs = glob(["src/test/**/*.java"]),
  deps = [
    "//app/src/main/java/app",
    "//persistence/src/main/java/persistence",
    "//external:hamcrest-core-jar",
    "//external:junit-jar",
  ],
)
