# bazel_java_example

An example of setting up a multi project bazel build.

It's composed of two parts:
* persistence - a java library
* app - a java application that uses the library

## Commands

Run app:

```
bazel run app
```

Build everything:

```
bazel build //...
```

Test an app:

```
bazel test app:test
```

Test everything:

```
bazel test //...
```
