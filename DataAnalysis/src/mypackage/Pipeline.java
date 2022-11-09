package mypackage;

import java.util.*;
import edu.stanford.nlp.pipeline.StanfordCoreNLP;

public class Pipeline {
	private static Properties properties;
	private static String propertiesName ="tokenize, ssplit, pos, lemma, ner, parse, sentiment";
	private static StanfordCoreNLP stanfordcorenlp;
	
	private Pipeline()
	{
		
	}
	static
	{
		properties = new Properties();
		properties.setProperty("annotators", propertiesName);
	}
	public static StanfordCoreNLP getPipeline()
	{
		if(stanfordcorenlp == null)
		{
			stanfordcorenlp = new StanfordCoreNLP(properties);
		}
		return stanfordcorenlp;
	}
	

}
