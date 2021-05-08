var faqs_row = 0;
function addfaqs() {
    html = '<tr id="faqs-row' + faqs_row + '">';
    html += '<td><input type="number" class="form-control" placeholder="Quantity"></td>';
    html += '<td><select class="form-control">\n' +
        '                                        <option th:value="${measurement}"\n' +
        '                                                th:each="measurement : ${T(pl.javastart.cookbook.recipe.model.Measurement).values()}"\n' +
        '                                                th:text="${measurement.name()}">MEASUREMENT</option>\n' +
        '                                    </select></td>';
    html += '<td><input type="text" class="form-control" placeholder="Ingredient"></td>';
    html += '<td class="mt-10"><button class="badge badge-danger" onclick="$(\'#faqs-row' + faqs_row + '\').remove();"><i class="fa fa-trash"></i> Delete</button></td>';

    html += '</tr>';

    $('#faqs tbody').append(html);

    faqs_row++;
}