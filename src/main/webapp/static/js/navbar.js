function getConferences() {

    $.getJSON('/api/conference/', {
        ajax: 'true'
    }, function (data) {
        var $ul = $('#conference-dropdowns').find('ul');
        $.each(data, function (index,single) {
            console.log(single.id + " " + single.conferenceName);
            var $li = $("<li class='dropdown'>");
            var $ul1 = $("<ul class='dropdown-menu multi-level' role='menu' aria-labelledby='dropdownMenu'>");
            var $li2 = $("<li class='dropdown-submenu'>");
            var $ul2 = $("<ul class='dropdown-menu'>");
            $li.append(
                "<a class='dropdown-toggle' data-toggle='dropdown' role='button' aria-expanded='false'>" +single.conferenceName+ "<span class='caret'></span></a>"
            );

                $.each(single.divisionList, function (_, division) {
                    $li2.append(
                        "<a tabindex='-1' href='#'>" +division.divisionName+ "</a>"
                    );

                $.each(division.teamList, function (_, team) {
                    $ul2.append(
                        "<li><a href='#'>" +team.teamName+ "</a></li>"
                    );

                });
                    $li2.append($ul2);
                    $li2.append("</ul>");

                    $ul1.append($li2);
                    $ul1.append("</li>");
            });
            $li.append($ul1);
            $li.append("</ul>");

            $ul.append($li);
            $ul.append("</li>");
        });

    });
}