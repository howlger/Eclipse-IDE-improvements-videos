package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

@Mojo(name = "modelgen", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class ModelgenMojo extends AbstractMojo {

	@Parameter(defaultValue = "${project}", required = true, readonly = true)
	MavenProject project;

	public void execute() throws MojoExecutionException {
		var model= Paths.get(project.getBasedir().toString(), "model.txt");
		var out= Paths.get(project.getCompileSourceRoots().get(0), "Model.java");
		try {
			var content = new StringBuilder();
			content.append("// GENERATED - DO NOT EDIT\n")
			       .append("public class Model {\n");
			for (String line : Files.readAllLines(model)) {
				content.append("\n\tpublic String ")
				       .append(line)
				       .append(";\n");
			}
			content.append("\n}");
			Files.write(out, content.toString().getBytes());
		} catch (IOException e) {
			getLog().error(e);
		}
	}

}