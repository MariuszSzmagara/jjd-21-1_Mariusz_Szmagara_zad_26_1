INSERT INTO recipe(id, title, serves, preparation_time, category, likes_counter, is_liked)
VALUES (1, 'Enfrijoladas with Black Beans, Avocado and Cotija', 4, 30, 'BREAKFAST', 30, false),
       (2, 'Shakshuka with Feta, Olives, and Peppers', 4, 50, 'BREAKFAST', 69, false),
       (3, 'Frittata with Potatoes, Red Peppers, and Spinach', 6, 40, 'BREAKFAST', 48, false),
       (4, 'Classic Chicken Salad', 4, 30, 'LUNCH', 52, false),
       (5, 'Ham Salad', 4, 10, 'LUNCH', 23, false),
       (6, 'Best Ever Tuna Salad Sandwich', 1, 5, 'LUNCH', 77, false),
       (7, 'Classic Baked Chicken', 4, 65, 'DINNER', 100, false),
       (8, 'Kentucky Hot Brown', 2, 30, 'DINNER', 90, false),
       (9, 'Easy Homemade Hummus', 2, 5, 'SNACKS', 77, false),
       (10, 'Mango Salsa', 1, 10, 'SNACKS', 123, false),
       (11, 'Brownie in a Mug', 1, 5, 'DESSERT', 91, false),
       (12, 'Rice Pudding', 4, 35, 'DESSERT', 126, false);

INSERT INTO ingredient(id, quantity, measurement, name, recipe_id)
VALUES (1, 1, 'TABLESPOON', 'extra-virgin olive oil', 1),
       (2, 1, 'LARGE', 'red onion, thinly sliced, divided', 1),
       (3, 2, 'CLOVE', 'garlic, thinly sliced', 1),
       (4, 1, 'PIECE', 'chipotle chili in adobo sauce', 1),
       (5, 2, 'CAN', 'cans black bean, not drained or 3 1/2 cups cooked beans plus 1 cup bean cooking liquid', 1),
       (6, 1, 'TABLESPOON', 'lime juice', 1),
       (7, 2, 'TEASPOON', 'ground cumin', 1),
       (8, 1, 'TABLESPOON', 'kosher salt', 1),
       (9, 8, 'PIECE', 'corn tortillas', 1),
       (10, 0.5, 'CUP', 'crumbled cotija cheese', 1),
       (11, 0.3, 'CUP', 'Mexican salsa', 1),
       (12, 0.3, 'CUP', 'light or regular sour cream', 1),
       (13, 0.3, 'CUP', 'chopped cilantro', 1),
       (14, 2, 'TABLESPOON', ' olive oil', 2),
       (15, 1, 'TEASPOON', 'smoked paprika', 2),
       (16, 1, 'TEASPOON', 'ground cumin', 2),
       (17, 0.25, 'TEASPOON', 'teaspoon Maras or Aleppo pepper flakes, or 1/8 teaspoon crushed red pepper flakes', 2),
       (18, 1, 'LARGE', 'yellow onion, halved and thinly sliced', 2),
       (19, 2, 'CLOVE', 'garlic, thinly sliced', 2),
       (20, 1, 'PIECE', 'red bell pepper, seeded and thinly sliced', 2),
       (21, 1, 'PIECE', 'yellow bell pepper, seeded and thinly sliced', 2),
       (22, 1, 'CAN', 'whole peeled tomatoes, preferably San Marzano', 2),
       (23, 0.5, 'TEASPOON', 'salt, to taste', 2),
       (24, 4, 'OUNCE', 'feta cheese, crumbled', 2),
       (25, 0.33, 'CUP', 'pitted Kalamata or other olives in brine', 2),
       (26, 1, 'LARGE', 'eggs', 2),
       (27, 6, 'LARGE', 'eggs', 3),
       (28, 0.25, 'CUP', 'milk', 3),
       (29, 2.5, 'TABLESPOON', 'olive oil', 3),
       (30, 0.75, 'TEASPOON', 'ground turmeric', 3),
       (31, 0.5, 'CUP', 'diced red onions', 3),
       (32, 2, 'CLOVE', ' garlic, minced', 3),
       (33, 8, 'OUNCE', 'fingerling potatoes, thinly sliced down their length', 3),
       (34, 1, 'MEDIUM', 'red pepper, seeded and diced', 3),
       (35, 1, 'PIECE', 'scallion, thinly sliced', 3),
       (36, 1, 'CUP', ' baby spinach', 3),
       (37, 1, 'PINCH', 'Freshly ground black pepper', 3),
       (38, 1, 'POUND', 'boneless, skinless (raw) chicken breasts, cut into 2 1/2-inch chunks (or 2 to 3 cups cooked chicken meat)', 4),
       (40, 2, 'STALK', 'celery, chopped', 4),
       (41, 0.5, 'PIECE', 'red bell pepper, seeded and chopped', 4),
       (42, 6, 'PIECE', 'green olives, pitted and minced', 4),
       (43, 0.25, 'CUP', 'chopped red onion', 4),
       (44, 1, 'PIECE', 'apple, cored and chopped', 4),
       (45, 0.5, 'HEAD', 'iceberg head lettuce, sliced and chopped', 4),
       (46, 5, 'TABLESPOON', 'mayonnaise', 4),
       (47, 1, 'TABLESPOON', ' plum preserves, or any sweet berry preserve (or a lesser amount of honey)', 4),
       (48, 1, 'TEASPOON', ' fresh squeezed lemon juice', 4),
       (49, 1, 'PINCH', 'Salt and pepper to taste', 4),
       (50, 2, 'CUP', 'finely diced or ground ham (about 3/4 pound)', 5),
       (51, 3, 'MEDIUM', 'hard-boiled eggs, chopped', 5),
       (52, 0.25, 'CUP', 'sweet pickle relish', 5),
       (53, 0.25, 'CUP', 'mayonnaise', 5),
       (54, 2, 'TABLESPOON', 'minced green onion', 5),
       (55, 2, 'TABLESPOON', 'minced celery', 5),
       (56, 2, 'TABLESPOON', 'minced red bell pepper', 5),
       (57, 1, 'TABLESPOON', 'chopped fresh parsley', 5),
       (58, 1, 'TEASPOON', 'Dijon mustard', 5),
       (59, 1, 'TABLESPOON', 'lemon juice', 5),
       (60, 1, 'PINCH', 'cayenne (optional)', 5),
       (61, 1, 'PINCH', 'Salt and black pepper to taste', 5),
       (62, 1, 'CAN', 'tuna fish', 6),
       (63, 0.3, 'CUP', 'cottage cheese', 6),
       (64, 2, 'TABLESPOON', 'mayonnaise', 6),
       (65, 0.25, 'CUP', 'finely chopped red onion', 6),
       (66, 1, 'STALK', 'celery, finely chopped (about 1/2 cup)', 6),
       (67, 1, 'TABLESPOON', 'capers', 6),
       (68, 1, 'TABLESPOON', 'lemon juice', 6),
       (69, 1, 'PINCH', 'dill', 6),
       (70, 2, 'TABLESPOON', 'minced fresh parsley', 6),
       (71, 1, 'TEASPOON', 'Dijon mustard', 6),
       (72, 2, 'SLICE', 'bread, lightly toasted', 6),
       (73, 1, 'PIECE', '(3 to 4 pound) chicken, cut into 8 parts (2 breasts, 2 thighs, 2 legs, 2 wings), excluding the back', 7),
       (74, 2, 'TABLESPOON', 'Extra virgin olive oil', 7),
       (75, 1, 'PINCH', 'Kosher salt', 7),
       (76, 1, 'PINCH', 'Freshly ground black pepper', 7),
       (77, 0.5, 'CUP', 'low sodium chicken stock (see Recipe Note) or white wine for the gravy (optional)', 7),
       (78, 4, 'SLICE', 'bacon', 8),
       (79, 4, 'SLICE', 'Texas toast or white sandwich bread', 8),
       (80, 10, 'OUNCE', 'deli-sliced roast turkey', 8),
       (81, 1, 'PIECE', 'tomato', 8),
       (82, 0.125, 'TEASPOON', 'kosher salt (optional)', 8),
       (83, 0.125, 'TEASPOON', 'freshly ground black pepper (optional)', 8),
       (84, 0.5, 'TEASPOON', 'chopped fresh parsley, for garnish', 8),
       (85, 2, 'TABLESPOON', 'unsalted butter', 8),
       (86, 2, 'TABLESPOON', 'all-purpose flour', 8),
       (87, 1, 'CUP', 'whole milk, room temperature', 8),
       (88, 0.5, 'CUP', 'heavy cream, room temperature', 8),
       (89, 0.25, 'CUP', '(1 ounce) grated Pecorino Romano', 8),
       (90, 1, 'TEASPOON', 'kosher salt', 8),
       (91, 0.125, 'TEASPOON', 'freshly ground black pepper', 8),
       (92, 0.125, 'TEASPOON', 'ground nutmeg', 8),
       (93, 0.5, 'CUP', ' tahini (roasted, not raw)', 9),
       (94, 0.25, 'CUP', 'extra virgin olive oil (plus more for garnishing)', 9),
       (95, 2, 'CLOVE', 'garlic, mashed and roughly chopped', 9),
       (96, 2, 'CAN', 'chickpeas (garbanzo beans), drained', 9),
       (97, 0.25, 'CUP', 'lemon juice, freshly squeezed', 9),
       (98, 0.5, 'CUP', 'water', 9),
       (99, 0.5, 'TEASPOON', 'salt', 9),
       (100, 1, 'GARNISHES', 'A sprinkling of paprika, a swirl of olive oil, toasted pine nuts, and/or chopped parsley', 9),
       (101, 1, 'PIECE', 'mango, peeled, pitted, and finely diced (about 1 1/2 cup)', 10),
       (102, 1, 'TABLESPOON', 'finely chopped red onion', 10),
       (103, 2, 'PIECE', 'jalapeño chile, minced (less or more to taste, make sure to actually taste the chile first, some of them can be quite hot!)', 10),
       (104, 3, 'TABLESPOON', 'fresh cilantro leaves, chopped', 10),
       (105, 3, 'TABLESPOON', 'fresh lime juice', 10),
       (106, 2, 'TABLESPOON', '(30 ml) butter, mild extra-virgin olive oil, or neutral oil', 11),
       (107, 0.25, 'CUP', '(30 grams) flour', 11),
       (108, 3, 'TABLESPOON', '35 grams) sugar ', 11),
       (109, 2, 'TABLESPOON', '(13 grams) natural unsweetened cocoa powder (NOT Dutch processed)', 11),
       (110, 1, 'PINCH', 'salt', 11),
       (111, 1, 'PINCH', 'cinnamon, optional', 11),
       (112, 3, 'TABLESPOON', '(44 ml) milk, water, or coffee', 11),
       (113, 0.125, 'TEASPOON', 'vanilla extract', 11),
       (114, 1, 'GARNISHES', 'Ice cream, whipped cream, or heavy cream, for serving', 11),
       (115, 2.5, 'CUP', '(600 ml) of whole milk', 12),
       (116, 0.3, 'CUP', '66 grams) of uncooked short grain white rice', 12),
       (117, 1, 'PINCH', 'salt', 12),
       (118, 1, 'PIECE', 'egg', 12),
       (119, 0.25, 'CUP', '(50 grams) dark brown sugar', 12),
       (120, 1, 'TEASPOON', 'vanilla extract', 12),
       (121, 0.25, 'TEASPOON', 'cinnamon', 12),
       (122, 0.3, 'CUP', '(40 grams) raisins', 12);

INSERT INTO preparation_instruction(id, name, description, recipe_id)
VALUES (1, 'Sauté the onion and garlic:', 'Heat the olive oil in a large skillet over medium. Add 3/4 of the sliced onion and sauté until nearly tender, about 5 minutes. Add the garlic and sauté to soften, 2 minutes.', 1),
       (2, 'Blend the sauce:', 'Transfer the cooked onion and garlic to a blender along with the beans, including the bean liquid, chipotle, lime juice, cumin, salt, and 1/2 cup water. Blend until smooth and creamy. Taste and add more salt if needed, then blend again. ', 1),
       (3, 'Heat the sauce:', 'Transfer the beans back to the large skillet set over low heat. Cook for 4 to 6 minutes at simmer. The sauce should be the texture of a thick soup. Add more water, if needed, to thin to the appropriate consistency.', 1),
       (4, 'Assemble the dish:', 'Use a pair of tongs to heat a tortilla over a gas flame or in a dry skillet set over high heat until it begins to blister. Submerge the tortilla in the bean sauce, smothering it completely. Use a spatula to fold it in half and transfer to a dinner plate. Top with a tablespoon of cotija, a slice or 2 of avocado, and a tangle of raw sliced onions. Continue with remaining tortillas and bean sauce, figuring 2 enfrijoladas per plate.', 1),
       (5, 'Serve:', 'Serve immediately with the salsa, cilantro, sour cream and any remaining bean sauce for guests to add as they please.', 1),
       (6, 'Cook the onion and peppers:', 'In a large skillet over medium heat, heat the oil. Add the paprika, cumin, and pepper flakes and cook for 30 seconds to a minute to bloom the spices. Add the onion and cook, stirring occasionally, for 3 minutes. Add the garlic, red pepper, and yellow pepper and cook, stirring occasionally, for 15 minutes, or until the vegetables soften.', 2),
       (7, 'Crush the tomatoes and simmer them with the peppers:', 'In a bowl, break up the tomatoes with your hands. Add them to the skillet with the salt and cook for 5 minutes. Taste and add more salt, if you prefer.', 2),
       (8, 'Cook the eggs:', 'With the back of a spoon or a ladle, make 4 indentations in the sauce. Break an egg into a cup and carefully pour it into and indentation, being careful not to break the yolk. Repeat with the remaining eggs. (You can crack the egg directly into the sauce and skip the cup, but it’s easier to get a an errant egg shell or protect the dish from a bad egg if you use the cup method.) Sprinkle the feta and olives around the eggs. Cover the pan and simmer over medium heat for 8 minutes, or until the whites are set and the yolks are still soft. (If you like your eggs well done, cook for a minute or two longer.)', 2),
       (9, 'To serve:', 'Garnish with cilantro leaves and a sprinkling of red pepper flakes. Bring to the table and serve from the pan.', 2),
       (10, 'Preheat oven to 400F', '', 3),
       (11, 'In a small bowl, whisk eggs and milk together', 'Set aside.', 3),
       (12, 'Cook the onions and garlic:', 'Heat olive oil in a 10-inch oven-safe skillet or pan over medium heat. Add the turmeric and stir so that turmeric dissolves into the oil. Add diced onions and cook, stirring occasionally, until they start to soften, about 2 minutes. Add minced garlic and stir for 30 seconds.', 3),
       (13, 'Cook the potatoes and other vegetables:', 'dd the potatoes and a generous pinch of salt and cook, stirring occasionally, until some of the slices start to brown, 5 to 6 minutes. Add the red pepper and cook until they start to soften, about 2 minutes. Add scallions and spinach leaves and cook until the leaves start to wilt, stirring occasionally.', 3),
       (14, 'Pour egg mixture into the skillet', 'Reduce heat to medium-low. Cook until the eggs start to set on the bottom, about 2 to 3 minutes', 3),
       (15, 'Place skillet in the oven and bake for 8 to 9 minutes, until the center is set', 'Remove skillet from oven with oven mitts. Let frittata cool for 5 minutes before serving. Cut into wedges and season with more salt and some ground pepper, if desired. Frittata will keep refrigerated for 5 days. Leftovers can be eaten chilled or briefly warmed in the microwave.', 3),
       (16, 'Poach the chicken (skip if using already cooked chicken):', 'Bring a pot with 2 quarts of well salted water (1 tablespoon salt) to a boil. Add the chicken breast (cut into large chunks) and return the water to a simmer. Then turn off the heat, and cover the pot. Let the chicken sit for 15 minutes (time it) or more while you prepare everything else.', 4),
       (17, 'Make the dressing:', 'Prepare the chicken salad dressing in a large bowl. Mix together the mayonnaise, preserves, and lemon juice. Taste for the proper balance of sweetness and acidity. The salad dressing should not be too sweet, nor too sour. Add more preserves or lemon juice until you have reached the balance you want. Add salt and pepper to taste.', 4),
       (18, 'Mix in the chopped celery, bell pepper, olives, red onion, and apple', '', 4),
       (19, 'Dice the chicken, mix with dressing and vegetables:', 'Remove the chicken from the poaching water and dice it. (Or dice already cooked chicken if that is what you are using for this salad.) Mix it in with the dressing and vegetables', 4),
       (20, 'Add lettuce:', 'At this point you can make ahead. When ready to serve, fold in the sliced and chopped iceberg lettuce.', 4),
       (21, 'Mix the ham salad:', 'Mix everything but the salt, pepper and cayenne in a large bowl. Taste and add cayenne, salt and black pepper to taste. Serve chilled.', 5),
       (22, 'Serve:', 'Serve straight, or mixed in with macaroni, or in a sandwich in a hamburger bun, slider roll, Kaiser roll, regular bread, in a pita or as a wrap. Good with lemonade on a hot day.', 5),
       (24, 'Mix:', 'In a medium bowl, mix all of the ingredients until combined.', 6),
       (25, 'Serve:', 'Serve tuna salad on toast, either open faced, or in a regular sandwich with lettuce and tomatoes. For a low carb option, serve on sliced lettuce.', 6),
       (26, 'Trim and salt the chicken:', 'Trim the chicken pieces of excess fat. Pat the chicken pieces dry with a paper towel. Sprinkle all sides with salt. Let the chicken pieces sit for 15 to 20 minutes to take the chill off.', 7),
       (27, 'Preheat the oven to 400°F (205°C)', '', 7),
       (28, 'Prep the chicken:', 'Pat the chicken pieces dry with a paper towel. Rub olive oil over the chicken pieces and on the bottom of the roasting pan. Sprinkle the chicken pieces all over with black pepper and a little more salt. Arrange the chicken pieces in the pan so that all the pieces are skin-side up, and the largest pieces (the breasts) are in the center of the pan. Dont crowd the pan; allow room in between the pieces.', 7),
       (29, 'Bake the chicken:', 'Bake (uncovered) in the oven for 30 minutes at 400°F (205°C). This initial high heat will help brown the chicken. Then lower the heat to 350°F (175°C) and bake for an additional 10-30 minutes until the juices run clear (not pink) when poked with a sharp knife or the internal temperature of the chicken breasts is 165°F (74°C), and of the thighs is 170°F (77°C) when tested with a meat thermometer. If the chicken isnt browning well enough, place the chicken under the broiler for the last 5 minutes of cooking, until browned sufficiently.', 7),
       (30, 'Let it rest:', 'Remove from oven and transfer the chicken to a serving dish. Tent with aluminum foil and let rest for 5 to 10 minutes before serving.', 7),
       (31, 'Make gravy:', 'If you would like to make gravy with the drippings from the chicken, place the roasting pan with all its drippings on the stovetop and set the burner to medium heat. Use a metal spatula to scrape up the stuck drippings from the bottom of the pan. When the pan is hot, pour in some white wine or chicken stock to help loosen the drippings from the pan. Transfer the drippings and stock/wine mixture to a saucepan and heat on medium high until reduced to your desired thickness. If you want the gravy even thicker, you can make a slurry with a little cornstarch or flour (a teaspoon) and water (1/4 cup), and add that to the gravy while it cooks.', 7),
       (32, 'Serve:', 'Serve with steamed rice, mashed potatoes, or Spanish rice.', 7),
       (33, 'Preheat the oven, prepare two baking sheets:', 'Preheat the oven to 400°F. Line two rimmed baking sheets with heavy duty aluminum foil—one for the bacon and other to assemble the sandwiches, it should be large enough to set two slices of bread side by side.', 8),
       (34, 'Cook the bacon:', 'Lay the bacon slices on one of the baking sheets. Cook the bacon, until crispy and to your liking, rotating the pan halfway through cooking if necessary, and checking for doneness at about 12 minutes. Transfer bacon to a paper-towel lined plate to drain excess grease.', 8),
       (35, 'Toast the bread and assemble the sandwiches:', 'Toast 4 slices of bread in a toaster, toaster oven, or regular oven. On the remaining baking sheet place two slices of toast side by side in a single layer. Cut the other two slices of toast on a diagonal to form triangles and set those pieces aside. Cut four slices of tomato. Divide the turkey evenly between the slices of toast on the baking sheet. Top each stack of turkey with two slices of tomato. Season with salt and pepper.', 8),
       (36, 'Make the cheese sauce:', 'Set a small heavy-bottomed saucepan over medium heat. Add the butter. Once it melts, slowly whisk in the flour and continue to whisk until the mixture turns a shade darker and begins to smell slightly nutty, about 1 minute. This will allow the raw flour taste to cook out. Slowly pour in the milk and cream, whisking constantly, until the mixture is smooth and thick, about 3 minutes. When you first start pouring in the liquid, it will look ugly and grainy. Dont worry! It will calm down, come back together and smooth itself out once all of the liquid is whisked in.', 8),
       (37, 'Remove from heat and add the cheese:', 'Remove from heat and add the cheese: Remove the sauce from the heat and whisk in the cheese, salt, pepper, and nutmeg. Whisk to combine until the cheese melts. Taste and adjust seasonings as necessary, keeping in mind the saltiness of your turkey. Spoon half of the sauce over each sandwich.', 8),
       (38, 'Broil the sandwiches:', 'Set the oven rack about 5 inches from the broiler element. Preheat the broiler. Broil the sandwiches until the sauce is browned in spots and bubbling, 3 to 5 minutes.', 8),
       (39, 'Serve the sandwiches:', 'With a spatula, transfer each sandwich and two triangles of toast to a plate. Spoon the remaining sauce from the baking dish onto the plates. Crisscross 2 slices of bacon over top each sandwich and garnish with parsley. Serve while still hot.', 8),
       (40, 'Process tahini and olive oil:', 'In a food processor, combine the tahini and olive oil and pulse until smooth.', 9),
       (41, 'Add remaining ingredients, process until smooth:', 'Then add the garlic, garbanzo beans, lemon juice, 1/2 cup water and 1/2 teaspoon of salt. Process until smooth. The longer you process in the food processor, the smoother the hummus will be. Add more salt or lemon juice to taste.', 9),
       (42, 'Serve:', 'Spoon into serving dish, swirl a little olive oil over the top and sprinkle with garnishes—a little paprika, toasted pine nuts, or chopped fresh parsley. Serve with crackers, raw dip vegetables such as carrots or celery, or with toasted pita bread. To toast pita bread, cut the pita bread into triangles, brush with olive oil and toast for 10 minutes in a 375°F oven, turning them over half-way through the cooking.', 9),
       (43, 'Mix:', 'Put the diced mango, red onion, jalapeño and cilantro in a medium bowl. Toss with lime juice. If the salsa is too acidic for you, stir in some diced avocado.', 10),
       (44, 'Serve:', 'Serve with fish, steak, tacos, or tortilla chips!', 10),
       (45, 'Melt the butter, if using:', 'Put the butter in a small microwave-safe bowl or ramekin, and microwave at 50% power (power level 5 on most microwaves) for 30 seconds. If it’s not melted after that, continue to microwave in 10-seconds bursts until it is.', 11),
       (46, 'Combine the dry ingredients in a mug:', 'Place the flour, sugar, cocoa, salt (if using unsalted butter), and optional cinnamon in a microwave-safe ceramic mug. Stir with a fork until it resembles brown sand and there are no clumps.', 11),
       (47, 'Add the wet ingredients and stir:', 'Stir in the butter (or oil) with a fork until a paste forms. Then add the milk (or water or coffee) and vanilla, and stir with the same fork until smooth. The batter may look a little thin, but don’t worry—that’s how it’s supposed to be.', 11),
       (48, 'Cook in the microwave:', 'Microwave, uncovered, on high power for 1 minute. You may need to adjust the time for less or more powerful microwaves. If you don''t know the power level on your microwave, start with 1 minute and continue cooking in 10-second increments until the brownie is done. For a 1000-watt microwave 1 minute is good; for 1650-watt microwaves, we recommend 1 minute and 10 seconds. After cooking, the brownie should still look a tad moist, not dry. Some wet-looking spots are okay; those will set up as the brownie rests.', 11),
       (49, 'Rest 4 minutes:', 'Let the brownie rest for 4 minutes. The inside of the brownie is very hot and still cooking, even though it’s not in the microwave. It may be hard, but the wait is worth it! It gives the brownie a better flavor and texture.', 11),
       (50, 'Top with ice cream:', 'Serve with a scoop of vanilla ice cream or a small dab of cream (whipped or unwhipped).', 11),
       (51, 'Cook the rice in milk:', 'In a medium-sized, heavy-bottomed saucepan, bring the milk, rice and salt to a boil over high heat. Reduce heat to low and simmer partially covered until the rice is tender, about 20-25 minutes. Stir frequently to prevent the rice from sticking to the bottom of the pan.', 12),
       (52, 'Mix egg and brown sugar, temper with rice mixture:', 'In a small mixing bowl, whisk together egg and brown sugar until well mixed. Add a half cup of the hot rice mixture to the egg mixture, a tablespoon at a time, vigorously whisking to incorporate.', 12),
       (53, 'Add tempered egg mixture back to rice mixture:', 'Add egg mixture back into the saucepan of rice and milk and stir, on low heat, for 5 to 10 minutes, until thickened, or about 160°F (71°C). Be careful not to have the mixture come to a boil at this point or it will curdle. Remove from heat and stir in the vanilla, raisins, and cinnamon.', 12),
       (54, 'Serve:', 'Serve warm or cold', 12);
