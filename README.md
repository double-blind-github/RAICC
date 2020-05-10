# RAICC
Reveal Atypical Inter-Component Communication

FORE REVIEWERS: 
 * For the sake of the double-blind-review process, this source code is not compilable

## Getting started

### Downloading the tool

<pre>
git clone https://github.com/XXXXXXXXX/RAICC.git
</pre>

### Installing the tool

<pre>
cd RAICC
mvn clean install:install-file -Dfile=libs/ic3-0.2.1-full.jar -DgroupId=edu.psu.cse.siis -DartifactId=ic3 -Dversion=0.2.1 -Dpackaging=jar
mvn clean install:install-file -Dfile=libs/preprocessIntentSender-0.1.jar -DgroupId=XXXXXX -DartifactId=preprocessIntentSender -Dversion=0.1 -Dpackaging=jar
mvn clean install
</pre>

### Using the tool

<pre>
java -jar RAICC/target/RAICC-0.1-jar-with-dependencies.jar <i>options</i>
</pre>

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details