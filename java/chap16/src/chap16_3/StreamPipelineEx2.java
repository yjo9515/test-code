package chap16_3;

import java.util.Arrays;
import java.util.List;

public class StreamPipelineEx2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("박성용","박상민","박지원","이현욱",
				"최민석","정영주","백유안","윤준오","윤재섭","박지원","최민석");
		
		//중복을 제거하고 이름 출력
		names.stream()
			.distinct()
			.forEach(n->System.out.println(n));
		System.out.println();
		//박씨로 시작하는 이름 출력
		names.stream()
			.filter(n -> n.startsWith("박"))
			.forEach(n-> System.out.println(n));
		System.out.println();
		//최씨로 시작하는사람의 이름을 중복을 제거하고 출력
		names.stream()
			.distinct()
			.filter(n->n.startsWith("최"))
			.forEach(n->System.out.println(n));
	}

}
