package cla.edg.actionpattern.favorite;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.List;

import org.junit.jupiter.api.Test;

import cla.edg.actionpattern.GenrationResult;

class FavoriteAPGeneratorTest {

	@Test
	void test() throws Exception {
		FavoriteAPInfo input = new FavoriteAPInfo();
		input.setActorModelName("moyi_user");
		input.setTargetModelName("moyi_shop");
		input.setRecordModelName("favorite_shop_of_user");
		input.setBasePackageName("com.terapico.moyi");
		input.setUserContextClassName("CustomMoyiUserContextImpl");
		
		FavoriteAPGenerator generator = new FavoriteAPGenerator();
		generator.setInput(input);
		List<GenrationResult> list = generator.runJob();
//		System.out.println(list.get(2).getFileName());
//		System.out.println(list.get(2).getContent());
		
		File tgtFolder = new File("/works/jobs/moyi_v3/workspace/moyi-biz-suite/bizcore/WEB-INF/moyi_v3_src");
		generator.saveToFiles(tgtFolder, list);
	}

}
