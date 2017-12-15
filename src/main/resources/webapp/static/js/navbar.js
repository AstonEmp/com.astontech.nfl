function getConferences() {

    $.getJSON('/api/conference/', {
        ajax: 'true'
    }, function (data) {
        var $ul = $('#conference-dropdowns').find('ul');
        $.each(data, function (index,single) {
            console.log(single.id + " " + single.conferenceName);
            var $li = $("<li class='dropdown'>");
            var $ul1 = $("<ul class='dropdown-menu multi-level' role='menu' aria-labelledby='dropdownMenu'>");

            $li.append(
                "<a class='dropdown-toggle' data-toggle='dropdown' role='button' aria-expanded='false'>" +single.conferenceName+ "<span class='caret'></span></a>"
            );

                $.each(single.divisionList, function (_, division) {
                    var $li2 = $("<li class='dropdown-submenu'>");
                    var $ul2 = $("<ul class='dropdown-menu'>");
                    $li2.append(
                        "<a tabindex='-1' href='/division/" + division.id + "'>" +division.divisionName+ "</a>"
                    );

                $.each(division.teamList, function (_, team) {
                    $ul2.append(
                        "<li><a href='/team/" + team.id + "'>" +team.teamName+ "</a></li>"
                    );

                });

                    $li2.append($ul2);

                    $ul1.append($li2);

            });
            $li.append($ul1);

            $ul.append($li);
        });

    });
}