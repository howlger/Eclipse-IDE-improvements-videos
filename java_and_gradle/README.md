# Storyboard

* Java 12
    1. New Java Project `sample`
        1. Show JavaSE-12...
        2. but choose JavaSE-11
    2. Create `module.info` dialog:
        1. Follow link to edit template
            * _Comments > File_ - see below
            * _Comments > Type_ - /** TODO comment */
    3. Create package `com.example.sample` with comments
    4. Example with `switch`: see below
* Maven
    1. Convert to Maven project -> shows feature flag
    2. In right-click menu use new menu item: _Maven > Update Project..._ -> compile error
    3. Add it again and do again _Maven > Update Project..._
* JPMS
    1. Java Build Path with new tab _Module Dependencies_: `--add-exports jdk.compiler/com.sun.tools.javac.tree=sample02` ->




    /*
     * This Example Content is intended to demonstrate usage of Eclipse technology.
     * It is provided to you under the terms and conditions of the
     * Eclipse Distribution License v1.0 which is available at
     * http://www.eclipse.org/org/documents/edl-v10.php
     */

https://stackoverflow.com/a/54071487/6505250

Code

    /*
     * This Example Content is intended to demonstrate usage of Eclipse technology.
     * It is provided to you under the terms and conditions of the
     * Eclipse Distribution License v1.0 which is available at
     * http://www.eclipse.org/org/documents/edl-v10.php
     */
    package sample03;

    /** TODO add comment */
    public class Greeter {

      enum Audience { WORLD, HUMAN, OTHER }

      static String getGreeting(Audience audience) {
        String greeting;
        switch (audience) {
        case WORLD:
        case HUMAN:
          greeting = "Hello " + audience.name().toLowerCase() + "!";
          break;

        default:
          greeting = "Hi!";
          break;
        }
        return greeting;
      }

      public static void main(String[] args) {
        System.out.println(getGreeting(Audience.WORLD));
        System.out.println(getGreeting(Audience.HUMAN));
        System.out.println(getGreeting(Audience.OTHER));
      }

    }

---


    plugins {
        id 'java'
        id 'eclipse'
    }

    task onSync {
        doLast {
            println 'Eclipse: Gradle > Refresh Gradle Project'
        }
    }

    task onBuild {
        doLast {
            println 'Eclipse: Project > Build Automatically (on save)' //
        }
    }

    eclipse {
        synchronizationTasks onSync
        autoBuildTasks onBuild
    }
