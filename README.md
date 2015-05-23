# bazel_java_example

An example of using bazel on a multi-module, maven style project.

It's composed of three parts:
* logging - a java library
* persistence - a java library
* app - a java application that uses the libraries

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
