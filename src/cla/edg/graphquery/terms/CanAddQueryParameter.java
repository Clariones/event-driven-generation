package cla.edg.graphquery.terms;

public interface CanAddQueryParameter {
	GraphQueryDescriber with_string(String name);
	GraphQueryDescriber with_integer(String name);
	GraphQueryDescriber with_decimal(String name);
	GraphQueryDescriber with_boolean(String name);
	GraphQueryDescriber pagination();
	GraphQueryDescriber no_pagination();
}
