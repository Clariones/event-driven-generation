package cla.edg.actionpattern.favorite;

import lombok.Data;

@Data
public class FavoriteAPInfo {
	String actorModelName;
	String targetModelName;
	String recordModelName;
	
	String basePackageName;
	String userContextClassName;
}
