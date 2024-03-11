@import org.example.hexlet.dto.DTOCourse;
@param DTOCourse page

<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <h1>${page.getTitle()}</h1>
    @if(page.getCourses().isEmpty())
        <p>Courses nit found</p>
    @else
        @for(var course : page.getCourses())
            <div>
                <h2>${course.getTitle()}</h2>
                <p>${course.getDescription()}</p>
            </div>
        @endfor
    @endif
</body>
</html>