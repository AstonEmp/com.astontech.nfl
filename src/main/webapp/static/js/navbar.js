function getConferences() {

    $.getJSON('/api/conference/', {
        ajax: 'true'
    }, function (data) {
        console.log(data);
        var $ul = $('#conference-dropdowns').find('ul');
        var newConference = "";
        $.each(data, function (index,conference) {
            console.log(conference.id + " " + conference.conferenceName);
            newConference = conference.conferenceName;
            var $li = $("<li class='dropdown'>");

            $li.append(
                "<a href='/conference/" + conference.id + "' class='dropdown-toggle' data-toggle='dropdown' " +
                "role='button' aria-expanded='false'>" + conference.conferenceName + "<span class='caret'></span>" + "</a>" +
                "<ul class='dropdown-menu' role='menu'>");

            $.each(single.divisionList, function (_, division) {
                $li.append(
                    "<li>" + "<a href='/conference/" + conference.id + "/division/" + division.id + "'>"
                    + division.divisionName + "</a>" + "</li>"
                );

                $.each(division.teamList, function (_, team) {

                });
            });
        });
    });
}

<ul class="dropdown-menu">
    <li><a tabindex="-1" href="#">Second level</a></li>
    <li class="dropdown-submenu">
        <a href="#">Even More..</a>
        <ul class="dropdown-menu">
            <li><a href="#">3rd level</a></li>
            <li><a href="#">3rd level</a></li>
        </ul>
    </li>
    <li><a href="#">Second level</a></li>
    <li><a href="#">Second level</a></li>
</ul>

