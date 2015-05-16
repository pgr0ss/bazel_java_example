java_binary(
  name = "app",
  main_class = "app.App",
  runtime_deps = [
    ":app-lib",
  ],
)

java_library(
  name = "app-lib",
  srcs = glob(["src/main/**/*.java"]),
  deps = [
    "//persistence",
  ],
)

java_test(
  name = "test",
  srcs = glob(["src/test/**/*.java"]),
  deps = [
    ":app-lib",
    "//persistence",
    "//external:hamcrest-core-jar",
    "//external:junit-jar",
  ],
)
