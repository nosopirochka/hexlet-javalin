package gg.jte.generated.ondemand;
import org.example.hexlet.dto.DTOCourse;;
public final class JtecoursesGenerated {
	public static final String JTE_NAME = "courses.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,10,10,10,10,11,11,13,13,14,14,16,16,16,17,17,17,19,19,20,20,22};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, DTOCourse page) {
		jteOutput.writeContent("\n<!DOCTYPE html>\n<html lang=\"ru\">\n<head>\n    <meta charset=\"UTF-8\">\n    <title>Title</title>\n</head>\n<body>\n    <h1>");
		jteOutput.setContext("h1", null);
		jteOutput.writeUserContent(page.getTitle());
		jteOutput.writeContent("</h1>\n    ");
		if (page.getCourses().isEmpty()) {
			jteOutput.writeContent("\n        <p>Courses nit found</p>\n    ");
		} else {
			jteOutput.writeContent("\n        ");
			for (var course : page.getCourses()) {
				jteOutput.writeContent("\n            <div>\n                <h2>");
				jteOutput.setContext("h2", null);
				jteOutput.writeUserContent(course.getTitle());
				jteOutput.writeContent("</h2>\n                <p>");
				jteOutput.setContext("p", null);
				jteOutput.writeUserContent(course.getDescription());
				jteOutput.writeContent("</p>\n            </div>\n        ");
			}
			jteOutput.writeContent("\n    ");
		}
		jteOutput.writeContent("\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		DTOCourse page = (DTOCourse)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
