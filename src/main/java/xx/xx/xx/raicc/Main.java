package xx.xx.xx.raicc;

import edu.psu.cse.siis.ic3.Ic3CommandLineArguments;
import xx.xx.preprocessIntentSender.ISPreprocessor;
import xx.xx.xx.raicc.utils.RaiccCommandLineParser;

public class Main {

	public static void main(String[] args) {
		PreliminaryAnalysis analysis = new PreliminaryAnalysis();
		RaiccCommandLineParser parser = new RaiccCommandLineParser();
		Ic3CommandLineArguments commandLineArguments =
				parser.parseCommandLine(args, Ic3CommandLineArguments.class);
		if (commandLineArguments == null) {
			return;
		}
		commandLineArguments.processCommandLineArguments();
		ISPreprocessor isp = new ISPreprocessor(commandLineArguments.getApk(), commandLineArguments.getClasspath());
		isp.run();
		commandLineArguments.setApk(isp.getResultingApkPath());
		analysis.performAnalysis(commandLineArguments);
	}
}
