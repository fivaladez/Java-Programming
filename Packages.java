/*
Packages are used in Java in order to prevent naming conflicts, to control
access, to make searching/locating and usage of classes, interfaces,
enumerations and annotations easier, etc.

A Package can be defined as a grouping of related types (classes, interfaces,
enumerations and annotations) providing access protection and namespace management.

Programmers can define their own packages to bundle group of classes/interfaces,
etc. It is a good practice to group related classes implemented by you so
that a programmer can easily determine that the classes, interfaces,
enumerations, and annotations are related.

Since the package creates a new namespace there won't be any name conflicts
with names in other packages. Using packages, it is easier to provide access
control and it is also easier to locate the related classes.

While creating a package, you should choose a name for the package and include
a package statement along with that name at the top of every source file
that contains the classes, interfaces, enumerations, and annotation types
that you want to include in the package.

The package statement should be the first line in the source file.
There can be only one package statement in each source file, and it
applies to all types in the file.

If a package statement is not used then the class, interfaces, enumerations,
and annotation types will be placed in the current default package.

To compile the Java programs with package statements, you have to use -d
option as shown below.

    javac -d Destination_folder file_name.java

Then a folder with the given package name is created in the specified
destination, and the compiled class files will be placed in that folder.

The import Keyword
If a class wants to use another class in the same package, the package name need
not be used. Classes in the same package find each other without any special syntax.
*/
package packages;
/*
NOTE: to call this file you shall enter "java packages.Packages" in the cmd
*/
/*
import payroll.Employee;

In case you want to use a class outside the package where you are working.
*/

public class Packages {

    public static void main (String args[]){

        System.out.println("You are in Package class from packages package");
    }
}
