java_library(
  name = "persistence",
  visibility = ["//visibility:public"],
  srcs = glob(["src/main/**/*.java"]),
  deps = [],
)

java_test(
  name = "test",
  srcs = glob(["src/test/**/*.java"]),
  deps = [
    ":persistence",
    "//external:hamcrest-core-jar",
    "//external:junit-jar",
  ],
)
