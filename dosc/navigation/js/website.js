String.format = function (str) {
    let args = arguments, re = new RegExp("%([1-" + args.length + "])", "g");
    return String(str).replace(re,
        function ($1, $2) {
            return args[$2];
        }
    );
};

(function () {
    let site_list_html = "";
    let type_site_html = '<li class=\"title\"><svg class=\"icon\" aria-hidden=\"true\"><use xlink:href=\"#%1\"></use></svg>%2</li>\n';
    let node_site_html = '<li><a rel="nofollow" href="%1" target="_blank"><svg class="icon" aria-hidden="true"><use xlink:href="#%2"></use></svg>%3</a></li>\n';
    $.ajax({
        type: "GET",
        url: "js/data.json",
        async: true,
        success: function (data) {
            for (let i = 0; i < data.length; i++) {
                site_list_html += String.format(type_site_html, data[i].icon, data[i].title)
                let node = data[i].node;
                for (let j = 0; j < node.length; j++) {
                    site_list_html += String.format(node_site_html, node[j].url, node[j].icon, node[j].text)
                }
            }
            $('#site_list').append(site_list_html);
        },
        error: function (res) {
            console.log(res)
        }
    })
}());

