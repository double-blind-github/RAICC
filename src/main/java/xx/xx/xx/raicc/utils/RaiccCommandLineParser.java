package xx.xx.xx.raicc.utils;

import org.apache.commons.cli.Options;

import edu.psu.cse.siis.ic3.Ic3CommandLineParser;

public class RaiccCommandLineParser extends Ic3CommandLineParser {
	@Override
	protected void printHelp(Options options) {
		System.out.println("usage: raicc -a <apk file> -cp <classpath> -model <model directory>");
	}
}
